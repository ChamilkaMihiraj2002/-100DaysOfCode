import os
import cv2 as cv
import glob
import numpy as np
import math
import matplotlib.pyplot as plt

# Read Images

imageFiles = glob.glob(f"OpenCv/Resources/boat/*")
imageFiles.sort()

images = []
for filename in imageFiles:
    img = cv.imread(filename)
    img = cv.cvtColor(img, cv.COLOR_BGR2RGB)
    images.append(img)
    
num_images = len(images)

# Display Images
plt.figure(figsize=[30, 10])
num_cols = 3
num_rows = math.ceil(num_images / num_cols)
for i in range(0, num_images):
    plt.subplot(num_rows, num_cols, i+1)
    plt.axis('off')
    plt.imshow(images[i])
    
# Stitch Images
stiticher = cv.Stitcher_create()
status, result = stiticher.stitch(images)

if status == 0:
    plt.figure(figsize=[30, 10])
    plt.imshow(result)
    
plt.show()