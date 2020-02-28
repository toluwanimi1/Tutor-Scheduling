<?php
    require "header.php";
?>

    <main>
        <div class="wrapper-main">
            <section class="section-default">
                <?php
                    if (isset($_SESSION['userId'])) {
                        echo '<p class="login-status">You are logged out!</p>';
                    }
                    else {
                        echo '<p class="login-status">You are loggeed in!</p>';
                    } 
                ?>
            </section>
        </div>
    </main>

<?php
    require "footer.php";
?>