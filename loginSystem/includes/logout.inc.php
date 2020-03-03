<?php

// Starts the session
session_start();

// Removes all session variables
session_unset();

// Destroys the session
session_destroy();

// Send the user back to the home page
header("Location: ../index.php");