import cv2 as cv
import matplotlib.pyplot as plt 


# Read image as gray scale(0 means one channel).
img = cv.imread('OpenCv/Resources/Apollo_11_Launch.jpg')


cv.rectangle(img, (500, 100), (700, 600), (255, 0, 255), thickness=5, lineType=cv.LINE_8)

plt.imshow(img[:,:,::-1])

plt.show()