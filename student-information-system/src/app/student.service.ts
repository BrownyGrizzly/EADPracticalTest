import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

interface Student {
  studentId: number;
  studentCode: string;
  fullName: string;
  address: string;
}

interface Subject {
  subjectId: number;
  subjectCode: string;
  subjectName: string;
  credit: number;
}

interface Score {
  studentScoreId: number;
  score1: number;
  score2: number;
  grade: string;
}

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl = 'http://localhost:8080/api/students';

  constructor(private http: HttpClient) { }

  getStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(this.baseUrl);
  }

  addStudent(student: Student): Observable<Student> {
    return this.http.post<Student>(this.baseUrl, student);
  }

  getSubjects(): Observable<Subject[]> {
    return this.http.get<Subject[]>(`${this.baseUrl}/subjects`);
  }

  getScoresForStudent(studentId: number): Observable<Score[]> {
    return this.http.get<Score[]>(`${this.baseUrl}/${studentId}/scores`);
  }

  addScore(studentId: number, score: Score): Observable<Score> {
    return this.http.post<Score>(`${this.baseUrl}/${studentId}/scores`, score);
  }
}

