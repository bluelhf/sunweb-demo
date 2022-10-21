# SunWeb Demo
This repository demonstrates using the `jdk.httpserver` module to implement a simple web server and HTTP API endpoints.

## Navigation
The main application, i.e. the server, is located in `app`. The main class is `blue.lhf.sunweb_demo.App`,
which contains the logic for creating the endpoints and registering their handlers.

By default, several endpoints are available:
1. `/api/toggle` - Simple plaintext response.
2. `/api/potato` - Mutable state handler, counts requests and returns the count with the prefix `potato `.
3. `/` - If no other contexts are matched, this endpoint serves static files from `./app/content`.

## Running

To run the project, first ensure you have [Git](https://git-scm.com/) installed. Then, execute these commands in your terminal shell of choice:
1. `git clone https://github.com/bluelhf/sunweb-demo`
2. `cd sunweb-demo`
3. `gradlew run`
> **Note**  
> Not sure what a shell is?
> - On Windows, you should open the **Windows Terminal** program (on older versions, try Command Prompt)
> - On macOS, you'll need the **Terminal** program.
> 
> You can run commands by typing them into the program window and pressing `Enter`.
