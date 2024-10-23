<?php
    $value = 5;
    function test() {
        global $value;
        echo "Global value " . $value;
    }

    test();
?>
