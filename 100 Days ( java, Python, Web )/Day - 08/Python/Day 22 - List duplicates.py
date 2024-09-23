data = [10, 23, 65, 98, 10, 23]

def delete_dup(data_list):
    unique_data = []  # List to store unique elements
    for item in data_list:
        if item not in unique_data:  # Check if the item is not already in the unique_data list
            unique_data.append(item)  # Append it if it's unique
    return unique_data

print(f"Original list : {data}, Updated list : {delete_dup(data)}")
