# Codeforces Problem Solutions

Welcome to the **Codeforces Problem Solutions** repository! This repository contains my accepted solutions for various Codeforces problems, written in both C++ and Java. It is designed for easy navigation, automated testing, and sharing with the programming community.

---

## 📂 Repository Structure

```
codeforces/
├── cpp/         # C++ solutions (e.g., 236A.cpp)
├── java/        # Java solutions (e.g., 236A.java)
├── testcases/   # Input/output files for automated testing
└── .github/
    └── workflows/  # GitHub Actions for CI
```

---

## 🚀 Features

- **Multi-language Support:** All solutions are available in both C++ and Java.
- **Automated Testing:**
  - There are now two separate GitHub Actions workflows:
    - `codeforces-cpp.yml`: Runs only for C++ files and testcases.
    - `codeforces-java.yml`: Runs only for Java files and testcases.
  - Each workflow:
    - Compiles all solutions in its language
    - Runs them against sample testcases from Codeforces
    - Checks output correctness (if `.out` files are present)
- **Easy to Add New Problems:** Just add your solution and corresponding testcase files!

---

## 🧪 How to Add Testcases

1. Place input files as `testcases/PROBLEM.in` (e.g., `236A.in`).
2. Place expected output as `testcases/PROBLEM.out` (optional, for output checking).
3. The workflow will automatically use these files for testing.

---

## 🛠️ How to Contribute

- Fork the repository
- Add your solution(s) in the appropriate folder
- Add sample input/output files in `testcases/`
- Create a pull request!

---

## 🤖 Continuous Integration

This repository uses GitHub Actions to ensure all solutions compile and pass sample testcases. See `.github/workflows/codeforces-cpp.yml` and `.github/workflows/codeforces-java.yml` for details.

---

## 💬 Questions & Discussions

- If you have questions, suggestions, or want to discuss anything related to this repository, please use the **GitHub Discussions** section!
- If you want to add or help manage solutions in other languages (e.g., Python, Go, etc.), feel free to open a discussion or issue to coordinate folder structure and workflow updates.

---

## 📚 License

This repository is for educational purposes. Feel free to use, share, and contribute!

---

Happy Coding! 🚩
