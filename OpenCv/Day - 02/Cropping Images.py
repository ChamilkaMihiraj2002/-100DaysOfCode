import cv2 as cv
import matplotlib.pyplot as plt

# Img Location
img = cv.imread('OpenCv/Resources/New_Zealand_Lake.jpg', cv.IMREAD_COLOR)
#plt.imshow(img)


# Crop
crop_img = img[:, :, :: -1]
#plt.imshow(crop_img)

#Crop
cropped_region = img[400:800, 600:1200]
plt.imshow(cropped_region)

plt.show()