from flask import Flask, request
app = Flask(__name__)

@app.route('/',methods=['GET'])
def get_text_input():
    text = request.args.get('name')
    print(text)
    return text
if __name__ == "__main__":
    app.run(host='localhost',debug=True)