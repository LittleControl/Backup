<?php

echo "www.littlecontrol.top";
echo "<br>";
echo "day08 文件上传";
echo "<br>";
// print_r($_FILES);
$fileInfo = $_FILES["upFile"];
$fileName = $fileInfo["name"];
$filePath = $fileInfo["tmp_name"];
move_uploaded_file($filePath,"../public/img/".$fileName);
echo "上传成功!";

?>