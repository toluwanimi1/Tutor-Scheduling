<?php
    require "index.php";
?>

    <main>
        <div class="wrapper-main">
            <section class="section-default">
                <h1>Register</h1>
                <?php
                    if (isset($_GET['error'])) {
                        if ($_GET['error'] == "emptyfields") {
                            echo '<p class="registererror">Fill in all fields!</p>';
                        }
                        else if ($_GET['error'] == "invalidemailuid") {
                            echo '<p class="registererror">Invalid username and e-mail!</p>';
                        }
                        else if ($_GET['error'] == "invalidemail") {
                            echo '<p class="registererror">Invalid e-mail!</p>';
                        }
                        else if ($_GET['error'] == "invaliduid") {
                            echo '<p class="registererror">Invalid username!</p>';
                        }
                        else if ($_GET['error'] == "passwordcheck") {
                            echo '<p class="registererror">Passwords do not match!</p>';
                        }
                        else if ($_GET['error'] == "uidtakensidtaken") {
                            echo '<p class="registererror">Username taken!</p>';
                        }
                    }
                    else if ($_GET['signup'] == "success") {
                        echo '<p class="registersuccess">Registration Successful!</p>';
                    }
                ?>
                <form class="form-register" action="includes/register.inc.php" method="post">
                    <input type="text" name="uid" placeholder="Username">
                    <input type="text" name="email" placeholder="E-Mail">
                    <input type="text" name="sid" placeholder="Student ID">
                    <input type="password" name="pwd" placeholder="Password">
                    <input type="password" name="pwd-repeat" placeholder="Repeat Password">
                    <button type="register" name="register-submit">Register</button>
                </form>
            </section>
        </div>
    </main>