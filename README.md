# <div align="center">🛒 E-Commerce 🛍</div>
&nbsp; 
&nbsp;
&nbsp;
&nbsp; 
&nbsp; 
&nbsp; 
 

<B>Part 2 - [E-Commerce Website]()    <BR>
   Part 3 - [E-Commerce - Flutter Mobile App]()     <BR><BR><BR>
      <BR><BR>
</B>
  
  
# Part 1 - Android App

This App is linked to my e-commerce website via web-services using a REST API developed; which are the other parts of this project. <BR>   

<div class="row">
  <div class="column">
    <img src="https://4.bp.blogspot.com/-NnAkV5vpYuw/XNMYF4RtLvI/AAAAAAAAI70/kdgLm3cnTO4FB4rUC0v9smscN3zHJPlLgCLcBGAs/s1600/Jetpack_logo%2B%25282%2529.png" alt="Adobe XD" width="80px">
  </div>
   
  <div class="column">
    <img src="https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/1200px-Java_programming_language_logo.svg.png" alt="Adobe XD" width="40px">
  </div>
  
  <div class="column">
    <img src="https://cdn.worldvectorlogo.com/logos/adobe-xd.svg" alt="Adobe XD" width="60px">
  </div>
</div>



  - Displaying exact reason for order return
  - Google Maps & a article on it
- Poster

<BR> 
  
[Project Report]()

 
<BR><BR>

## 📸 Screenshots

<table>
  <tr>
    <th>Adress</th>
    <th>Cart</th>
    <th>Home</th>
  </tr>
  <tr>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/address.jpg" width="250px"></td>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/cart.jpg" width="250px"></td>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/home.jpg" width="250px"></td>
  </tr>
 
 <tr>
    <th>Navigation Drawer</th>
    <th>Order Summary</th>
    <th>Payment</th>
  </tr>
  <tr>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/navigation%20drawer.jpg" width="250px"></td>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/order%20summary.jpg" width="250px"></td>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/payment.jpg" width="250px"></td>
  </tr>
  
  <tr>
    <th>Payment 2</th>
    <th>Sign In</th>
    <th>Sign Up</th>
  </tr>
  <tr>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/payment2.jpg" width="250px"></td>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/signin.jpg" width="250px"></td>
    <td><img src="https://github.com/KulkarniAtharva/E-Commerce-Android/blob/master/Screenshots/signup.jpg" width="250px"></td>
  </tr>
</table>

  
<BR><BR>
   
## Features

<BR><BR>
  
  
## Built With 🛠
- [Java](https://www.java.com/en/) - Most widely used programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
- [Koin](https://insert-koin.io) - Dependency Injection Framework
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [GSON](https://github.com/google/gson) - A Java serialization/deserialization library to convert Java Objects into JSON and back.
- [GSON Converter](https://github.com/square/retrofit/tree/master/retrofit-converters/gson) - A Converter which uses Gson for serialization to and from JSON.
- [OkHttp3](https://github.com/square/okhttp) -  For implementing interceptor, logging and mocking web server.
- [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.

Broadcast receiver  <BR>
Room Persistence Library   <BR>



### Other Concepts included
- RecyclerView
- GridView
- CardView
- CircularImageView
- ImageSlider
- Fragments
- Passing data between activities, fragments
- SearchView
- SwipeRefresh
- BottomSheet

<BR><BR>
  
  
# Package Structure
    
    dev.atharvakulkarni.e_commerce   # Root Package
    .
    ├── data                # For data handling.
    │   ├── model           # Model classes
    │   ├── network         # Remote Data Handlers     
    |   │   ├── api         # Retrofit API for remote end point.
    │   └── repository      # Single source of data.
    |
    |
    ├── ui                  # Activity/View layer
    │   ├── main            # Main Screen Activity & ViewModel
    |   │   ├── adapter     # Adapter for RecyclerView
    |   │   ├── viewmodel   # ViewHolder for RecyclerView   
    │   └── details         # Detail Screen Activity and ViewModel
    |
    └── utils               # Utility Classes / Kotlin extensions
    
    
<BR><BR>
  
    
## 👨‍🔧 Architecture
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.

![](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

<BR><BR>

## 📱 Contact - Let's become friend  🤝
- [Portfolio Website](https://kulkarniatharva.github.io/)
- [Github](https://github.com/KulkarniAtharva)
- [LinkedIn](https://www.linkedin.com/in/atharva-kulkarni-146279187/)
- [Facebook](https://www.facebook.com/atharva.kulkarni.96343/)


<BR><BR>

 ## 😎 More Projects   
 
 I don't stop here.  <BR>
 Some of my best projects you must see :  👇👇👇👇👇👇
 
 <!--
 
 - [E Commerce - Website & Android App]()  - Android   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (currently viewing)
 - [Messenger - Mobile App & Web App]()  - Flutter                                                             
 - [Movie Finder](https://github.com/KulkarniAtharva/Movie_Finder-Android)      - Android
 - [Weather App]()    - Android
 - [PokeDex]()  - Flutter
 - [Meditation & Yoga]()  - Flutter
 - [Book App]()   - Flutter
 - [Doctor Booking]()   - Flutter
 - [Media Player Controller]()  -  Python-OpenCV 
 - [Cartoonify Image]()  - Python-OpenCV
 
 
 -->
 
 <BR>
   
   
   
 
<table style="width:100%">
  <tr>
    <th>Android</th>
    <th>Flutter</th> 
    <th>Web</th>
    <th>Machine Learning</th> 
  </tr>
  <tr>
    <td>E-Commerce</td>
    <td>E-Commerce</td>
    <td>E-Commerce</td>
    <td>Emotion & Gesture Recognition</td>
    <td></td>
  </tr> 
  <tr>
    <td>Messenger</td>
    <td>Messenger</td> 
    <td>Messenger</td>
    <td>Face Recognition</td>
  </tr>    
  <tr>
    <td>Movie Finder</td>
    <td>PokeDex</td>
    <td>Portfolio (new)</td>
    <td>Cartoonify Image</td>
  </tr>
  <tr>
    <td>Weather App</td>
    <td>Meditation & Yoga</td>
    <td>Portfolio (old)</td>
    <td>Live Sketch using Webcam</td>
  </tr>  
  <tr>
    <td>KKW Alerts</td>
    <td>Book App</td>
    <td>Photography</td>
    <td>Finding Waldo</td>
  </tr>  
  <tr>
    <td></td>
    <td>Doctor Booking</td>
    <td>Tic-Tac-Toe</td>
    <td>Handwritten Digit Recognition</td>
  </tr>
  <tr>
    <td></td>
    <td>Dating App</td>
    <td>Dating App</td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td>Grocery App</td>
    <td></td>
    <td></td>
  </tr>   
  <tr>
    <td></td>
    <td>News App</td>
    <td></td>
    <td></td>
  </tr>   
  <tr>
    <td></td>
    <td>Wallet App</td>
    <td></td>
    <td></td>
  </tr>   
  <tr>
    <td></td>
    <td>Travel App</td>
    <td></td>
    <td></td>
  </tr>   
  <tr>
    <td></td>
    <td>a</td>
    <td></td>
    <td></td>
  </tr> 
  <tr>
    <td></td>
    <td>a</td>
    <td></td>
    <td></td>
  </tr> 
  <tr>
    <td></td>
    <td>a</td>
    <td></td>
    <td></td>
  </tr> 
  <tr>
    <td></td>
    <td>a</td>
    <td></td>
    <td></td>
  </tr> 
  <tr>
    <td></td>
    <td>a</td>
    <td></td>
    <td></td>
  </tr> 
  <tr>
    <td></td>
    <td>s</td>
    <td></td>
    <td></td>
  </tr> 
    
   
</table>
     
     
 
 An overview of my skills & all my projects done can be found from my [Portfolio Website](https://kulkarniatharva.github.io/).
 
 <BR><BR>
 
 ## 📜 Licence
