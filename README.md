# 🍽️ Restaurant App

A clean and modern Android Restaurant App built with [Dicoding's Restaurant API](https://restaurant-api.dicoding.dev/).
This app demonstrates modern Android development practices using **Clean Architecture**, **MVVM**, **Jetpack Compose**, and more.

---

## ✨ Features

* 🍽️ Discover restaurants across Indonesia
* 🔍 Search for your favorite cuisines
* 🏪 View detailed restaurant info including menus and ratings
* ❤️ Add or remove restaurants from favorites
* 🚀 Smooth and responsive UI built with Jetpack Compose

---

## 🔧 Tech Stack

| Layer                | Technology                                                                                                        |
| -------------------- | ----------------------------------------------------------------------------------------------------------------- |
| **UI**               | [Jetpack Compose](https://developer.android.com/jetpack/compose)                                                  |
| **Architecture**     | Clean Architecture + MVVM                                                                                         |
| **DI**               | [Koin](https://insert-koin.io/)                                                                                   |
| **Networking**       | [Retrofit](https://square.github.io/retrofit/), [Coroutine](https://kotlinlang.org/docs/coroutines-overview.html) |
| **Async Handling**   | Kotlin Coroutines                                                                                                 |
| **State Management** | Jetpack Compose State & ViewModel                                                                                 |

---

## 🧱 Architecture

The project is built using **Clean Architecture**, separating responsibilities clearly into the following layers:

```
📁 data       -> Remote & local data sources, Retrofit API, DTOs  
📁 domain     -> Business logic: use cases, models, interfaces  
📁 presentation -> Jetpack Compose UI, ViewModels (MVVM)
```

Each layer communicates only with its direct neighbor, ensuring low coupling and high testability.

---

## 🚀 Getting Started

### Requirements

* Android Studio Giraffe or higher
* JDK 17
* Minimum SDK 21+

### Installation

1. Clone the repo:

   ```bash
   git clone https://github.com/username/restaurant-app.git
   ```
2. Open in Android Studio
3. Run the app on emulator or device

---

## 🗂️ Modules Structure

```
restaurant-app/
📀 data
📀 domain
📀 presentation
📀 di (for Koin modules)
```

* `data`: Handles API calls and data transformations
* `domain`: Contains use cases and entity models
* `presentation`: UI built with Jetpack Compose + ViewModel
* `di`: All dependency injection setup using Koin

---

## 🧠 Why This Project?

This app is a demonstration of scalable and modern Android development best practices.
It’s designed to be readable, testable, and easily extensible – ideal as a template or reference for:

* Personal projects
* Job application portfolios
* Android architecture learning

---

## 🙌 Credits

* API by [Dicoding](https://restaurant-api.dicoding.dev/)
* Icons from [Material Design Icons](https://fonts.google.com/icons)

---

## 💋 Let's Connect

If you're an HR, recruiter, or fellow developer looking to collaborate, feel free to reach out!

* 💼 [LinkedIn](https://linkedin.com/in/yourprofile)
* ✉️ [your.email@example.com](mailto:your.email@example.com)

---

## 📝 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
