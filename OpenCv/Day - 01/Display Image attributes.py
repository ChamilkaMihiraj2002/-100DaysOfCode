import cv2 as cv

# Read image as gray scale(0 means one channel).
img = cv.imread('Resources/checkerboard_18x18.png', 0)

# print the size  of image
print("Image size (Hight, Wide) is:", img.shape)

# print data-type of image
print("Data type of image is:", img.dtype)