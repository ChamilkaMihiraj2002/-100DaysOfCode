<?php
    $value = 5;
    function test() {
        $setValue = $GLOBALS['value'];
        echo "Global value " . $setValue;
    }

    test();
?>
