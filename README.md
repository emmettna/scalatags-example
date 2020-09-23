# Purpose of this repository
- Showing the minimal working scalatags html server on http4s
- Http4s wasn't necessary but it was easiest way

# How to try the project
1. Clone the project and open with your favorite IDE or Terminal
2. Run commands in Sbt shell
    ```scala
    > reStart
    ```
3. You will be able to see something similar to
    ```
    root [ioapp-compute-0] INFO  o.h.s.b.BlazeServerBuilder - 
    root   _   _   _        _ _
    root  | |_| |_| |_ _ __| | | ___
    root  | ' \  _|  _| '_ \_  _(_-<
    root  |_||_\__|\__| .__/ |_|/__/
    root              |_| 
    ```
    - It's written Http4s believe it or not
4. Access to http://localhost:8080/ then you will see the "Hello World" 