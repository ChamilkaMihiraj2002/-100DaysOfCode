import cv2 as cv
import matplotlib.pyplot as plt

# Split the image into the B, G, R components
img_NZ_bgr = cv.imread("Resources/New_Zealand_Lake.jpg", cv.IMREAD_COLOR)
b, g, r = cv.split(img_NZ_bgr)

# Show the channels
plt.figure(figsize=[20, 5])

plt.subplot(141)
plt.imshow(r, cmap="gray")
plt.title("Red Channel")

plt.subplot(142)
plt.imshow(g, cmap="gray")
plt.title("Green Channel")

plt.subplot(143)
plt.imshow(b, cmap="gray")
plt.title("Blue Channel")

# Merge the individual channels back into a BGR image
imgMerged = cv.merge((b, g, r))

# Show the merged output (convert BGR to RGB using slicing)
plt.subplot(144)
plt.imshow(imgMerged[:, :, ::-1])  # Convert BGR to RGB for display
plt.title("Merged Output")

plt.show()