import cv2 as cv
import matplotlib.pyplot as plt

# Read image.
img = cv.imread('Resources\coca-cola-logo.png')

# Display image 
plt.imshow(img)
plt.show()

"""

The color displayed above is different from the actual image. 
This is because matplotlib expects the image in RGB format whereas OpenCV stores images in BGR format. 
Thus, for correct display, we need to reverse the channels of the image. 
We will discuss about the channels in the sections below.

"""

# print the size  of image
print("Image size (H, W, C) is:", img.shape)

# print data-type of image
print("Data type of image is:", img.dtype)

# Display image
coke_img_channels_reversed = img[:, :, ::-1]
plt.imshow(coke_img_channels_reversed)
plt.show()