import cv2 as cv
import matplotlib.pyplot as plt


# Read images
img_rec = cv.imread("OpenCv/Resources/rectangle.jpg", cv.IMREAD_GRAYSCALE)
img_cir = cv.imread("OpenCv/Resources/circle.jpg", cv.IMREAD_GRAYSCALE)

#plt.figure(figsize=[20, 5])
#plt.subplot(121);plt.imshow(img_rec, cmap="gray")
#plt.subplot(122);plt.imshow(img_cir, cmap="gray")
print(img_rec.shape)

# Bitwise AND Operator
result = cv.bitwise_and(img_rec, img_cir, mask=None)
plt.imshow(result, cmap="gray")

# Bitwise OR Operator
result = cv.bitwise_or(img_rec, img_cir, mask=None)
plt.imshow(result, cmap="gray")

# Bitwise XOR Operator
result = cv.bitwise_xor(img_rec, img_cir, mask=None)
plt.imshow(result, cmap="gray")

plt.show()