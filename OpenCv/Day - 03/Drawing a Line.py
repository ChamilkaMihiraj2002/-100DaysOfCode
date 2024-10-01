import cv2 as cv
import matplotlib.pyplot as plt 


# Read image as gray scale(0 means one channel).
img = cv.imread('OpenCv/Resources/Apollo_11_Launch.jpg')


# The line starts from (200,100) and ends at (400,100)
# The color of the line is YELLOW (Recall that OpenCV uses BGR format)
# Thickness of line is 5px
# Linetype is cv2.LINE_AA

cv.line(img, (200, 100), (400, 100), (0, 255, 255), thickness= 5 , lineType= cv.LINE_AA)

plt.imshow(img[:,:,::-1])

plt.show()