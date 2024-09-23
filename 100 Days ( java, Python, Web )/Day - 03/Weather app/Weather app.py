import requests

def get_weather(api_key, city):
    base_url = "https://api.openweathermap.org/data/2.5/weather"
    params = {
        'q': city,
        'appid': api_key,
        'units': 'metric'  # For temperature in Celsius; use 'imperial' for Fahrenheit
    }
    response = requests.get(base_url, params=params)
    return response.json()

def display_weather(data):
    if data.get("cod") != 200:
        print(f"Error fetching data: {data.get('message', 'Unknown error')}")
        return

    main = data['main']
    weather = data['weather'][0]
    
    print(f"City: {data['name']}")
    print(f"Temperature: {main['temp']}°C")
    print(f"Weather: {weather['description']}")
    print(f"Humidity: {main['humidity']}%")

def main():
    api_key = ''  # Replace with your API key
    city = input("Enter city name: ")
    weather_data = get_weather(api_key, city)
    display_weather(weather_data)

if __name__ == "__main__":
    main()