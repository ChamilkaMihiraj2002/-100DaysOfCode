import cv2 as cv

# Img Location
img = cv.imread('OpenCv/Resources/New_Zealand_Lake.jpg', cv.IMREAD_COLOR)

# Convert from BGR to RGB
img_rgb = cv.cvtColor(img, cv.COLOR_BGR2RGB)

# Display the image
cv.imshow("Original image", img_rgb)

# Resizing
resized = cv.resize(img_rgb, None, fx=0.5, fy=2)
cv.imshow("Resized image",resized)


cv.waitKey(0)