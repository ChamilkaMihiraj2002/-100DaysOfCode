import cv2 as cv
import matplotlib.pyplot as plt

source = 'OpenCv/Resources/Video/race_car.mp4'  # source = 0 for webcam
cap = cv.VideoCapture(source)

if not cap.isOpened():
    print("Error opening video stream or file")
    
ret, frame = cap.read()
plt.imshow(frame[..., ::-1])

plt.show()