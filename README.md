# 🎵 Ứng Dụng Nhạc - Shiin
<img width="658" height="686" alt="image" src="https://github.com/user-attachments/assets/2f3a333e-343e-4fdc-9936-f6dd624168ea" />

## Giới thiệu

**Ứng Dụng Nhạc - Shiin** là một ứng dụng Android được phát triển bằng Java, mang đến trải nghiệm nghe nhạc tuyệt vời với giao diện thân thiện và tính năng đa dạng.

## ✨ Tính năng chính

- 🏠 **Trang chủ**: Hiển thị bài hát nổi bật, phổ biến và mới nhất
- 🎵 **Phát nhạc**: Trình phát nhạc với đầy đủ tính năng điều khiển
- ❤️ **Yêu thích**: Lưu và quản lý bài hát yêu thích
- 🔍 **Tìm kiếm**: Tìm kiếm bài hát theo tên
- 👤 **Tài khoản**: Đăng ký, đăng nhập, đổi mật khẩu
- 👑 **Admin**: Panel quản trị để thêm/sửa/xóa bài hát
- 💬 **Phản hồi**: Gửi phản hồi và liên hệ

## 🛠️ Công nghệ sử dụng

- **Ngôn ngữ**: Java
- **Platform**: Android (API 23+)
- **Database**: Firebase Realtime Database
- **Authentication**: Firebase Auth
- **UI**: Material Design với ViewBinding
- **Image Loading**: Glide
- **Architecture**: MVP Pattern với Design Patterns

## 📱 Yêu cầu hệ thống

- Android 6.0 (API level 23) trở lên
- Kết nối Internet
- Google Play Services

## 🚀 Cài đặt và chạy

1. Clone repository này
2. Mở project trong Android Studio
3. Cấu hình Firebase:
   - Thêm file `google-services.json` vào thư mục `app/`
   - Cập nhật Firebase Database Rules
4. Build và chạy ứng dụng

## 🎨 Design Patterns được sử dụng

- **Singleton Pattern**: DataStoreManager
- **Observer Pattern**: Firebase listeners, BroadcastReceiver
- **Strategy Pattern**: Các loại bài hát (Popular, Featured, New)
- **Adapter Pattern**: RecyclerView adapters
- **Template Method Pattern**: BaseActivity
- **Service Pattern**: MusicService cho phát nhạc nền
- **Repository Pattern**: Firebase data access

## 👨‍💻 Developer

**Shiin** - Developer đam mê âm nhạc và công nghệ

- 📧 Email: shiin2ii.dev@gmail.com

## 📄 License

Ứng dụng này được phát triển cho mục đích học tập và nghiên cứu.

## 🤝 Đóng góp

Mọi đóng góp và phản hồi đều được chào đón! Hãy tạo issue hoặc pull request.

---

**"Âm nhạc cho cuộc sống"** - Shiin Music App
