<?php
    $numbers = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    foreach ($numbers as $number) {
        echo $number."\n";
    }

    $numbers[5] = 1010;

    echo "\n\n";
    foreach ($numbers as $number) {
        echo $number."\n";
    }
?>
