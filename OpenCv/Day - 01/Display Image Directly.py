import cv2 as cv
import numpy as np
import matplotlib.pyplot as plt



# Display 18x18 pixel image.
img = cv.imread('Resources/checkerboard_18x18.png')
cv.imshow('Display 18x18 pixel image.', img)

# Display 84x84 pixel image.
img = cv.imread('Resources\checkerboard_84x84.jpg')
cv.imshow('Display 84x84 pixel image.', img)

cv.waitKey(0)