def temparature(value):
    return (value - 32) * (5/9)

x = float(input("Enter temparature in °F :"))
print(f"{x}°F = {temparature(x)}°C")