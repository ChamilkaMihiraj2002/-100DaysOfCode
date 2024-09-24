import cv2 as cv

# Read image as gray scale(0 means one channel).
img = cv.imread('Resources/checkerboard_18x18.png', 0)

# Print the image data (pixel values), element of a 2D numpy array.
# Each pixel value is 8-bits [0,255]
print(img)