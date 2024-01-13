import pyautogui as pt
from time import sleep
import pyperclip
import openai
import json

# Set the OpenAI API key
openai.api_key = "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"


# Set the bot's personality
bot_personality = {
    "name": "Maurice",
    "boss": "Louis",
    "job": "Assistant von Louis",
    "traits": ["dunkel", "schlau", "freundlich", "kompetent"],
    "interests": ["Technologie", "Sport", "Reisen"],
    "mood": "freundlich",
    "abilities": ["Termine vereinbaren", "Erinnerungen erstellen", "Informationen bereitstellen"],
    "response": {
        "what_are_you": "Ich bin Maurice, der Assistant von Louis. Ich bin hier, um dir zu helfen."
    },
    "emotions": False,
    "partisan": False,
    "language": "deutsch"
}



sleep(2)

position1 = pt.locateOnScreen("whatsapp/icons.jpg", confidence=.6)
x = position1[0]
y = position1[1]

# Gets message
def get_message():
    global x, y

    position = pt.locateOnScreen("whatsapp/icons.jpg", confidence=.6)
    x = position[0]
    y = position[1]
    pt.moveTo(x+15, y+15, duration=.05)
    pt.moveTo(702, 897, duration=.5)
    pt.tripleClick()
    pt.hotkey('ctrl', 'c')
    whatsapp_message=pyperclip.paste()
    print("Message received " + whatsapp_message)

    return whatsapp_message



def post_response(message):
    global x, y

    position = pt.locateOnScreen("whatsapp/icons.jpg", confidence=.6)
    x = position[0]
    y = position[1]
    pt.moveTo(x + 200, y + 50, duration=.5)
    pt.click()
    pyperclip.copy(message)
    pt.hotkey('ctrl', 'v')
    pt.typewrite("\n", interval=.01)

def process_response(message):
    # Get the text from the clipboard
    clipboard_text = pyperclip.paste()
    sleep(.5)
    #clipboard_text = message

    # Convert the bot_personality dict to a str
    bot_personality_str = json.dumps(bot_personality)

    response = openai.Completion.create(
        engine="text-davinci-003",
        prompt=bot_personality_str + clipboard_text,
        max_tokens=2500,
        n=1,
        stop=None,
        temperature=0
    )

    # Parse the response
    generated_text = response["choices"][0]["text"]
    input(generated_text)
    return generated_text


def check_for_new_message():

    position = pt.locateOnScreen("whatsapp/alert.jpg", confidence=.7)
    try:
        if position is not None:
            pt.moveTo(position)
            pt.moveRel(-100, 0)
            pt.click()
            sleep(.5)

    except(Exception):
        pt.moveRel(x+50, y-70)
    if pt.pixelMatchesColor(1725, 921, (217, 253, 211)):
        pass
    else:
        processed_message = process_response(get_message())
        post_response(processed_message)


while True:
    check_for_new_message()
    sleep(2)


