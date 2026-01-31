const input = document.getElementById("login");

input.addEventListener("input", () => {
  const value = input.value.trim();

  if (/^\d+$/.test(value)) {
    // Lab worker (numeric ID)
    input.inputMode = "numeric";
  } else {
    // Patient (email)
    input.inputMode = "email";
  }
});

/* If input contains only digits → lab worker login
   Else → patient email login */