package com.example.smarthostelapp

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object AdminDashboard : Screen("admin_dashboard")
    object StudentDashboard : Screen("student_dashboard")
    object RoomManagement : Screen("room_management")
    object Attendance : Screen("attendance")
    object IssueReporting : Screen("issue_reporting")
}
