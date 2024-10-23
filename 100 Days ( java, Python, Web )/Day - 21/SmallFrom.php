<html>
    <head>
        <title>Simple Form</title>
    </head>
    <body>
        <form action="SmallFrom.php" method="GET">
            <div>
                <div>
                    <label for="userName">Name :
                        <input type="text" name="userName">
                    </label>
                </div>

                <div>
                    <label for="userAge">Age :
                        <input type="text" name="userAge">
                    </label>
                </div>

                <input type="submit" name="submit" value="submit">
            </div>

        </form>

    </body>
</html>

<?php
    if (isset($_GET['submit'])) {
        if ($_SERVER["REQUEST_METHOD"] == "GET") {
            $name = $_GET["userName"];
            $age = $_GET["userAge"];
        } else {
            echo "Invalid Request";
        }

        echo "Submitted data <br>";
        echo "Name: " . $name . "<br>";
        echo "Age: " . $age . "<br>";
    }

?>
