# Artist API
---
Dependecies : Spring Web , MySQL Driver , Spring Data JPA
---

# To run the project : 

* Clone the git repository

* Open the project using Intellij IDEA

Note : The dependencies will take some time to load.

* After the dependencies have been installed, type the following command in the terminal/console to run the application :
```
mvn spring-boot:run
```


---

```
# API Endpoint : http://localhost:8080
```

### /getArtists
* Gets list of all the artists
* `Request Type : GET`

### /getArtist
* Gets an artist based on artist id
* `Request Type : GET`


### /addArtist
* Adds an artist 
* `Request Type : Post`

### /updateArtist
* Updates the details of an artist based on it's id
* `Request Type : Put`

### /deleteArtist
* Deletes an Artist based on it's id
* `Request Type : Delete`


---


# API Specifications at a Glance
- [x] Supports basic CRUD operations.
- [x] User can create, read, update and delete an artist

# Feature in Progress
- [] Booking / Cancellation of an event 


## Author : [Chiraag Kakar](https://github.com/chiraag-kakar)
