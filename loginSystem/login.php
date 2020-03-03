<?php
    require "index.php";
?>
 <main>
        <div class="wrapper-main">
            <section class="section-default">
                <h1>Login</h1>
                <?php
                    if (isset($_GET['error'])) {
                        if ($_GET['error'] == "emptyfields") {
                            echo '<p class="loginerror">Fill in all fields!</p>';
                        }
                        else if ($_GET['error'] == "wrongpassword") {
                            echo '<p class="loginerror">Wrong password!</p>';
                        }
                    }
                    else if ($_GET['signup'] == "success") {
                        echo '<p class="loginsuccess">Login Successful!</p>';
                    }
                ?>
                <form action="includes/login.inc.php" method="post">
                    <input type="text" name="mailuid" placeholder="Username">
                    <input type="password" name="pwd" placeholder="Password">
                    <button type="login" name="login-submit">Login</button>
                </form>
            </section>
        </div>
    </main>