<?php
    session_start()
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="description" content="This is an example.">
        <meta name=viewport content="width=device-width, initial-scale=1">
        <title></title>
        <link rel="stylesheet" href="style.css">
        </head>
        <body>
            
            <header>
                <nav>
                    <a href="#">
                        <img src="img/logo.png" alt="bowie state logo">
                    </a>
                    <u1>
                        <1i><a href="index.php">Home</a></1i>
                        <1i><a href="#">Tutors</a></1i>
                        <1i><a href="#">Tutees</a></1i>
                        <1i><a href="#">Login</a></1i>
                    </u1>
                    <div class="header-login">
                        <?php 
                            if (isset($_SESSION['userId'])) {
                                echo '<form action="includes/logout.inc.php" method="post">
                                <button type="submit" name="logout-submit">Logout</button>
                            </form>';
                            }
                            else {
                                echo '<form action="includes/login.inc.php" method="post">
                                <input type="text" name="mailuid" placeholder="Username/E-mail...">
                                <input type="password" name="pwd" placeholder="Password...">
                                <button type="submite" name="login-submit">Login</button>
                            </form>
                            <a href="register.php" class="header-register">Register</a>';
                            } 
                        ?>
                    </div>
                </nav>
             </header>