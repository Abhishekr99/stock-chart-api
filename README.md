## Branch info:
`auth branch` has all required routes for frontend webApp but uses MySQL for local DB \
`master branch` has all routes except authentication module (JWT, login, register) \
`postGre branch` has all required routes for [deployed frontend webApp](https://stockchartify.herokuapp.com/) but uses PostGre DB hosted in heroku

## For running project locally:
1] clone auth branch \
2] cd <project dir> \
3] mvn spring-boot:run (or Run use IDE to run the main method as java application) \
4] Open [http://localhost:8082](http://localhost:8082) to view it in the browser.

## Deployed URL for backend
Open [https://stockchartify-api.herokuapp.com/](https://stockchartify-api.herokuapp.com/) to view it in the browser.

## Post-man collection:
https://www.getpostman.com/collections/bbf896f408a1458736a2 \

First use `/api/auth/signin` to get JWT token\
Add Authorization header `Bearer token` to test other end-points
