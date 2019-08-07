<?php
    print_r($_POST);
    echo "<br>";
    print_r($_FILES);
    $fileInfo = $_FILES["upFile"];
    $fileName = $fileInfo["name"];
    $filePath = $fileInfo["tmp_name"];
    move_uploaded_file($filePath,"./src/".$fileName)
?>