import cv2 as cv
import matplotlib.pyplot as plt 


# Read image as gray scale(0 means one channel).
img = cv.imread('OpenCv/Resources/Apollo_11_Launch.jpg')


imageText = img.copy()
text = "Apollo 11 Saturn V Launch, July 16, 1969"
fontScale = 2.3
fontFace = cv.FONT_HERSHEY_PLAIN
fontColor = (0, 255, 0)
fontThickness = 2

cv.putText(imageText, text, (200, 700), fontFace, fontScale, fontColor, fontThickness, cv.LINE_AA)

plt.imshow(imageText[:,:,::-1])

plt.show()