import cv2 as cv

# Img Location
img = cv.imread('OpenCv/Resources/New_Zealand_Lake.jpg', cv.IMREAD_COLOR)

# Convert from BGR to RGB
img_rgb = cv.cvtColor(img, cv.COLOR_BGR2RGB)

# Display the image
cv.imshow("Original image", img_rgb)

# Resizing
width = 500
hight = 800

desired_size = (width, hight)
resized_img = cv.resize(img_rgb, dsize=desired_size, interpolation=cv.INTER_AREA)

# Display the image
cv.imshow("Resized image", resized_img)


cv.waitKey(0)