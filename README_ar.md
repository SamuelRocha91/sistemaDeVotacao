# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> نظام التصويت <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)

<p>هذا المشروع هو تقييم تم تطويره في وحدة جافا في دورة تطوير الويب في Trybe. تشمل المهارات التي تم تطويرها:</p>
<ol>
  <li>فهم المفاهيم الأساسية للبرمجة الكائنية (OOP) المطبقة على جافا؛</li>
  <li>منطق البرمجة؛</li>
  <li>تطبيق مفاهيم مثل الفئات، والكائنات، والطرق، والتغليف، والوراثة، والتعددية الشكلية، والواجهات، والفئات المجردة.</li>
</ol>
<p>تتكون التطبيق من نظام تصويت إلكتروني يسمح بتسجيل المرشحين، وتسجيل الناخبين، وإجراء التصويت، والتحقق من النتائج.</p>

<details>
  <summary><h2>الميزات</h2></summary>
  - **تسجيل المرشحين**: يتيح إضافة المرشحين إلى النظام مع الاسم والرقم.
  - **تسجيل الناخبين**: يتيح تسجيل الناخبين مع الاسم ورقم الهوية (CPF).
  - **نظام التصويت**: يمكن للناخبين التصويت بإدخال رقم الهوية (CPF) ورقم المرشح.
  - **النتائج الجزئية**: تظهر النتائج الجزئية للتصويت في أي وقت.
  - **إنهاء التصويت**: يعرض النتيجة النهائية عند إنهاء التصويت.
</details>

<details>
  <summary><h2>هيكل الكود</h2></summary>
  تُعتبر الدالة `main` مسؤولة عن تنفيذ البرنامج، حيث تقدم قائمة تفاعلية تسمح بتسجيل المرشحين والناخبين، وإجراء التصويت، وعرض النتائج. إليك ملخص موجز للمنطق المنفذ:

  ```java
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      GerenciamentoVotacao votacao = new GerenciamentoVotacao();
      int option = 0;

      // تسجيل المرشحين
      do {
          System.out.println("تسجيل شخص مرشح؟");
          System.out.println("1 - نعم");
          System.out.println("2 - لا");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("أدخل اسم الشخص المرشح:");
              String nome = scanner.next();
              System.out.println("أدخل رقم الشخص المرشح:");
              int numero = scanner.nextInt();
              votacao.cadastrarPessoaCandidata(nome, numero);
          }
      } while (option != 2);

      // تسجيل الناخبين
      do {
          System.out.println("تسجيل شخص ناخب؟");
          System.out.println("1 - نعم");
          System.out.println("2 - لا");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("أدخل اسم الشخص الناخب:");
              String nome = scanner.next();
              System.out.println("أدخل رقم الهوية للشخص الناخب:");
              String cpf = scanner.next();
              votacao.cadastrarPessoaEleitora(nome, cpf);
          }
      } while (option != 2);

      // التصويت والنتائج
      do {
          System.out.println("1 - التصويت");
          System.out.println("2 - النتيجة الجزئية");
          System.out.println("3 - إنهاء التصويت");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("أدخل رقم الهوية للشخص الناخب:");
              String cpf = scanner.next();
              System.out.println("أدخل رقم الشخص المرشح:");
              int voto = scanner.nextInt();
              votacao.votar(cpf, voto);
          }
          if (option == 2) {
              votacao.mostrarResultado();
          }
      } while (option != 3);

      votacao.mostrarResultado();
  }
  ```
</details>

<details>
  <summary><h2>التقنيات المستخدمة</h2></summary>
  - **جافا**: لغة البرمجة الرئيسية المستخدمة في التطوير.
  - **Scanner**: فئة من جافا تستخدم لالتقاط مدخلات المستخدم.
  - **البرمجة الكائنية**: مفاهيم OOP المطبقة على تصميم النظام.
</details>

<details>
  <summary><h2>مشاريع أخرى</h2></summary>
  - 🏛️ [محدد المتاحف](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)
  - 📃 [قواعد التقدم](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)
</details>

<details>
  <summary><h2>كيفية التشغيل</h2></summary>
  1. قم باستنساخ هذا المستودع إلى جهاز الكمبيوتر المحلي الخاص بك:
     ```sh
     git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
     ```

  2. افتح المشروع في IDE جافا المفضلة لديك.

  3. قم بترجمة وتشغيل التطبيق.
</details>
