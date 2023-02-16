# distanceConverter
Converter units of measurement of length
## How to use
Clone repository
> git clone https://github.com/GSDTR/distanceConverter.git

Cd working dir
> cd distanceConverter

Build image
> docker build -t app .
![docker build](pictures/build.png)

Run application
> docker run app (-ktom | -mtok | -vtok | -ktov | -mtov | -vtom) number

![run app 1 cf](pictures/run_ktom.png)

![run app 2 fc](pictures/run_vtok.png)

![run app 3 ck](pictures/run_mtov.png)