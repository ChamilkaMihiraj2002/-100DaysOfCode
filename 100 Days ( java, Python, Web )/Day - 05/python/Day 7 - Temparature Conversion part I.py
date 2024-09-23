def temparature(value):
    return (value * (9/5)) + 32

x = float(input("Enter temparature in °C :"))
print(f"{x}°C = {temparature(x)}°F")