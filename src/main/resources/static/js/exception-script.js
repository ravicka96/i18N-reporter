let isSliderOpen = false;

 // Function to toggle the exception slider
function toggleExceptionSlider() {
        const slider = document.getElementById("exception-slider");
        const bellIcon = document.getElementById("bell-icon");

        isSliderOpen = !isSliderOpen;

        if (isSliderOpen) {
            // Open the slider
            slider.style.right = "0";
            bellIcon.style.backgroundColor = "red";
            bellIcon.style.color = "white";
        } else {
            // Close the slider
            slider.style.right = "-1000px";
            bellIcon.style.backgroundColor = "red";
            bellIcon.style.color = "black";
        }
 }