# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> نظام التصويت <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91//sistemaDeVotacao/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ar.md)

<p>هذا المشروع هو تقييم تم تطويره في وحدة جافا لدورة تطوير الويب في Trybe. تشمل المهارات التي تم تطويرها:</p>
<ol>
  <li>فهم المفاهيم الأساسية للبرمجة الكائنية (OOP) المطبقة في جافا؛</li>
  <li>منطق البرمجة؛</li>
  <li>تطبيق مفاهيم مثل الفئات، الكائنات، الطرق، التغليف، الوراثة، تعدد الأشكال، الواجهات والفئات المجردة.</li>
</ol>
<p>تتكون التطبيق من نظام تصويت إلكتروني يسمح بتسجيل المرشحين، تسجيل الناخبين، إجراء التصويت والتحقق من النتائج.</p>

## الوظائف

- **تسجيل المرشحين**: يسمح بإضافة المرشحين إلى النظام بالاسم والرقم.
- **تسجيل الناخبين**: يسمح بتسجيل الناخبين بالاسم ورقم الهوية (CPF).
- **نظام التصويت**: يمكن الناخبين من التصويت عن طريق إدخال رقم الهوية (CPF) ورقم المرشح.
- **نتائج جزئية**: يظهر النتائج الجزئية للتصويت في أي وقت.
- **إنهاء التصويت**: يعرض النتيجة النهائية عند انتهاء التصويت.

## هيكل الكود

تكون دالة `main` مسؤولة عن تنفيذ البرنامج، حيث تعرض قائمة تفاعلية تسمح بتسجيل المرشحين والناخبين، التصويت وعرض النتائج. إليك ملخص للمنطق المنفذ:

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    int option = 0;

    // تسجيل المرشحين
    do {
        System.out.println("هل تريد تسجيل مرشح؟");
        System.out.println("1 - نعم");
        System.out.println("2 - لا");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("أدخل اسم المرشح:");
            String nome = scanner.next();
            System.out.println("أدخل رقم المرشح:");
            int numero = scanner.nextInt();
            votacao.cadastrarPessoaCandidata(nome, numero);
        }
    } while (option != 2);

    // تسجيل الناخبين
    do {
        System.out.println("هل تريد تسجيل ناخب؟");
        System.out.println("1 - نعم");
        System.out.println("2 - لا");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("أدخل اسم الناخب:");
            String nome = scanner.next();
            System.out.println("أدخل رقم الهوية (CPF) للناخب:");
            String cpf = scanner.next();
            votacao.cadastrarPessoaEleitora(nome, cpf);
        }
    } while (option != 2);

    // التصويت والنتائج
    do {
        System.out.println("1 - التصويت");
        System.out.println("2 - النتائج الجزئية");
        System.out.println("3 - إنهاء التصويت");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("أدخل رقم الهوية (CPF) للناخب:");
            String cpf = scanner.next();
            System.out.println("أدخل رقم المرشح:");
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

## التقنيات المستخدمة

- **جافا**: لغة البرمجة الرئيسية المستخدمة في التطوير.
- **Scanner**: فئة في جافا تستخدم لالتقاط إدخالات المستخدم.
- **البرمجة الكائنية**: مفاهيم البرمجة الكائنية المطبقة في تصميم النظام.

## مشاريع أخرى

- 🏛️ [محدد المتاحف](/sttps://github.com/SamuelRocha91/localizadorDeMuseus)
- 📃 [قواعد التقدم](https://github.com/SamuelRocha91/project_rule_of_progression)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix)

## كيفية التنفيذ

1. قم باستنساخ هذا المستودع إلى جهازك المحلي:
   ```sh
   git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
   ```

2. افتح المشروع في IDE جافا المفضلة لديك.

3. قم بترجمة وتشغيل التطبيق.
