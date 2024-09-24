import cv2 as cv
import matplotlib.pyplot as plt

# Read image.
img = cv.imread('Resources/checkerboard_18x18.png', 0)

# Display image.
plt.imshow(img)
plt.show()

# Set color map to gray scale for proper rendering.
plt.imshow(img, cmap="gray")
plt.show()