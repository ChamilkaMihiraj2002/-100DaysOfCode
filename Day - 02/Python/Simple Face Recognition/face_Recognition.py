import numpy as np
import cv2 as cv

haar_cascade = cv.CascadeClassifier('OpenCv/Learning/Face detection and Face recognition/haar_face xml/haar_face.xml')

people = ['Ben Afflek', 'Elton John', 'Jerry Seinfield', 'Madonna', 'Mindy Kaling']


#features = np.load('OpenCv/Learning/Face detection and Face recognition/Inbilt reg/features.npy')
#labels = np.load('OpenCv/Learning/Face detection and Face recognition/Inbilt reg/labels.npy')

face_recognizer = cv.face.LBPHFaceRecognizer_create()
face_recognizer.read('OpenCv/Learning/Face detection and Face recognition/Inbilt reg/face_trained.yml')

img = cv.imread(r'D:\Programming\OpenCv\Learning\Resources\Faces\val\mindy_kaling\1.jpg')

gary = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
cv.imshow('Person', gary)

# detect the face in the image
face_rect = haar_cascade.detectMultiScale(gary, 1.1, 4)

for (x,y,w,h) in face_rect:
    face_roi = gary[y:y+h, x:x+h]
    
    label, confidence = face_recognizer.predict(face_roi)
    print(f'Label = {people[label]} with a confidence of {confidence}')
    
    cv.putText(img, str(people[label]), (20,20), cv.FONT_HERSHEY_COMPLEX, 1.0, (0,255,0),thickness=2)
    cv.rectangle(img, (x,y), (x+w, y+h), (0,255,0), thickness=2)

cv.imshow('detected Face', img)

cv.waitKey(0)