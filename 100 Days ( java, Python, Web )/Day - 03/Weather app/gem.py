import tkinter as tk
from PIL import Image, ImageTk
import requests
import json

# Create main window
root = tk.Tk()
root.title("Weather App")

# Window Size
screen_width = root.winfo_screenwidth()
screen_height = root.winfo_screenheight()
x = (screen_width - 400) // 2  # Adjust the width and height as needed
y = (screen_height - 300) // 2
root.geometry(f"345x270+{x}+{y}")
root.resizable(False, False)

# Global variables for API key and image path
api_key = ""  # Replace with your actual OpenWeatherMap API key
image_path = "Python/Weather app/1.png"

# Function to fetch weather data with error handling
def get_weather(city):
    base_url = "https://api.openweathermap.org/data/2.5/weather"
    params = {
        'q': city,
        'appid': api_key,
        'units': 'metric'  # For temperature in Celsius; use 'imperial' for Fahrenheit
    }

    try:
        response = requests.get(base_url, params=params)
        response.raise_for_status()  # Raise an exception for HTTP errors
        return response.json()
    except requests.exceptions.RequestException as e:
        print(f"Error fetching weather data: {e}")
        return None

# Function to display weather information with error handling
def display_weather(data):
    if data is None:
        label1.config(text="Error fetching weather data. Please try again.")
        label2.config(text="")
        label3.config(text="")
        label4.config(text="")
        return

    try:
        main = data['main']
        weather = data['weather'][0]

        label1.config(text=f"City of Weather :  {data['name']}")
        label2.config(text=f"Temperature      :  {main['temp']}°C")
        label3.config(text=f"Weather              :  {weather['description']}")
        label4.config(text=f"Humidity            :  {main['humidity']}")
    except (KeyError, TypeError) as e:
        print(f"Error parsing weather data: {e}")
        label1.config(text="Error parsing weather data. Please try again.")
        label2.config(text="")
        label3.config(text="")
        label4.config(text="")

# Function to handle button click and fetch weather
def fetch_weather():
    city = city_entry.get().strip()  # Remove leading/trailing whitespace

    if not city:
        label1.config(text="Please enter a city name.")
        return

    weather_data = get_weather(city)
    display_weather(weather_data)

# Create and place widgets
image = Image.open(image_path)
resized_image = image.resize((130, 130))
photo = ImageTk.PhotoImage(resized_image)

label = tk.Label(root, image=photo).place(x=2, y=2)

city_label = tk.Label(root, text="CITY ::", font=("Helvetica", 15, "bold"), fg="blue", padx=20, pady=10, anchor="center")
city_label.place(x=125, y=20)

city_entry = tk.Entry(root, width=20, font=("Arial", 12), fg="blue", justify="center", state="normal")
city_entry.place(x=150, y=60)

fetch_button = tk.Button(root, text="Get Weather", bg="DarkSalmon", fg="white", font=("Helvetica", 10, 'bold'), width=22, command=fetch_weather)
fetch_button.place(x=150, y=90)

frame = tk.Frame(root, bg="light blue", bd=1, width=325, height=120)
frame.place(x=10, y=130)

# Create labels for weather information
label1 = tk.Label(frame, bg=frame["bg"])
label1.place(x=11, y=10)
label2 = tk.Label(frame, bg=frame["bg"])
label2.place(x=11, y=35)
label3 = tk.Label(frame, bg=frame["bg"])
label3.place(x=11, y=60)
label4 = tk.Label(frame, bg=frame["bg"])
label4.place(x=11, y=86)

root.mainloop()