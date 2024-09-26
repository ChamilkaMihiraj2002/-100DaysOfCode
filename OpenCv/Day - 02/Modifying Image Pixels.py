import cv2 as cv
import matplotlib.pyplot as plt

# Read image as gray scale(0 means one channel).
img = cv.imread('OpenCv\Resources\checkerboard_84x84.jpg', 0)
# Print the image data (pixel values), element of a 2D numpy array.
# Each pixel value is 8-bits [0,255]
print(img)

#cv.imshow('Image', img)

cb_img_copy = img.copy()
cb_img_copy[2, 2] = 200
cb_img_copy[2, 3] = 200
cb_img_copy[3, 2] = 200
cb_img_copy[3, 3] = 200

# Same as above
# cb_img_copy[2:3,2:3] = 200

plt.imshow(cb_img_copy, cmap="gray")
print(cb_img_copy)
plt.show()

cv.waitKey(0)
