from flask import Flask

# chamando método construtor flask
app = Flask(__name__)

@app.route("/")

def hello_world():
  return "Melinguica"

if __name__ == "__main__":
   app.run()