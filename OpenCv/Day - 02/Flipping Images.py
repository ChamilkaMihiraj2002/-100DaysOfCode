import cv2 as cv
import matplotlib.pyplot as plt

# Img Location
img_NZ_rgb = cv.imread('OpenCv/Resources/coca-cola-logo.png', cv.IMREAD_COLOR)


img_NZ_rgb_flipped_horz = cv.flip(img_NZ_rgb, 1)
img_NZ_rgb_flipped_vert = cv.flip(img_NZ_rgb, 0)
img_NZ_rgb_flipped_both = cv.flip(img_NZ_rgb, -1)

# Show the images
plt.figure(figsize=(18, 5))
plt.subplot(141)
plt.imshow(img_NZ_rgb_flipped_horz)
plt.title("Horizontal Flip")
plt.subplot(142)
plt.imshow(img_NZ_rgb_flipped_vert)
plt.title("Vertical Flip")
plt.subplot(143)
plt.imshow(img_NZ_rgb_flipped_both)
plt.title("Both Flipped")
plt.subplot(144)
plt.imshow(img_NZ_rgb)
plt.title("Original")


plt.show()