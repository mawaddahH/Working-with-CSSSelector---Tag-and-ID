# Working-with-CSSSelector---Tag-and-ID
Assignment 1 W9D3 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
On the Facebook website, use CSSSelector with Tag and ID and use it to sign up and register the account.
- STEP 1: Go to Facebook.com
- STEP 2: Right-click on the First Name and click on Inspect
- STEP 3: pick any UI Element using HTML code
- STEP 4: locate web elements using CSSSelector and fill all the fields and use it Sign Up Flow


## Answer

I used a ["Facebook"](https://www.facebook.com/r.php?locale=en_US)
And Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code.

some elements have a dynamic id generated, so I used cssSelector with Tag and Attribute as syntax:
`tag[attribute=value]`

and for elements that have no dynamic id generated, I used them in cssSelector with Tag and ID as syntax:
`#id`
or
`tag#id]`

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182492379-61cb28d3-d127-4dcf-af34-855aba13a011.png" width=60% height=60%>
</p>

---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182492873-5cc7d3f9-fd65-46d4-bb8e-25542e6bb9bb.png" width=80% height=80%>



https://user-images.githubusercontent.com/48597284/182493105-5eef2a6f-4553-43c4-ab41-18d63af53c27.mp4
</p>
