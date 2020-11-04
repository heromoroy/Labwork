using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Dynamic;
using System.Linq.Expressions;


namespace LR1OAIP
{
    class Program
    {
        static void Main(string[] args)
        {
            bool console = true;
            int PersTask;
            while (console == true)
            {
                Console.Write("Введите число {0} для открытия 1 задания, {1} для 2 задания. Для выхода из приложения введите число {2}: ", 1, 2, 0);
                PersTask = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine();
                Console.Clear();
                if (PersTask == 1)
                {
                    Console.WriteLine("Лабораторная работа №1. Разработка консольного приложения");
                    Console.WriteLine("Толстиков Савелий Романович");
                    Console.WriteLine("Информационные системы и технологии, ИНС-б-о-18-2");
                    Console.WriteLine("Город Изобильный, Ставропольский край");
                    Console.WriteLine("Английский язык");
                    Console.WriteLine("Японские автомобили, видеомонтаж, программирование на языках полезнее турбо пролога, планирую заниматься разработкой приложений/игр на C#.");
                    Console.WriteLine();
                }
                if (PersTask == 2)
                {
                    bool l = true;
                    while (l == true)
                    {
                        Console.WriteLine("Вариант задания: 31");
                        double R_x, a, b, t, f, x, i_2;
                        Console.WriteLine();
                        Console.WriteLine("Дано задание: R_x=a*b + b/t - x + f*i_2");
                        Console.WriteLine();
                        Console.Write("Введите число для a: ");
                        a = Convert.ToInt32(Console.ReadLine());
                        while (a == 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Похоже вы неподходящее число, введите иное число для a:");
                            a = Convert.ToInt32(Console.ReadLine());
                        }
                        Console.WriteLine();
                        Console.Write("Введите число для b: ");
                        b = Convert.ToInt32(Console.ReadLine());
                        while (b == 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Похоже вы неподходящее число, введите иное число для b:");
                            b = Convert.ToInt32(Console.ReadLine());
                        }
                        Console.WriteLine();
                        Console.Write("Введите число для t: ");
                        t = Convert.ToInt32(Console.ReadLine());
                        while (t == 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Похоже вы неподходящее число, введите иное число для t:");
                            t = Convert.ToInt32(Console.ReadLine());
                        }
                        Console.WriteLine();
                        Console.Write("Введите число для f: ");
                        f = Convert.ToInt32(Console.ReadLine());
                        while (f == 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Похоже вы неподходящее число, введите иное число для f:");
                            f = Convert.ToInt32(Console.ReadLine());
                        }
                        Console.WriteLine();
                        Console.Write("Введите число для x: ");
                        x = Convert.ToInt32(Console.ReadLine());
                        while (x == 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Похоже вы неподходящее число, введите иное число для x:");
                            x = Convert.ToInt32(Console.ReadLine());
                        }
                        Console.WriteLine();
                        Console.Write("Введите число для i_2: ");
                        i_2 = Convert.ToInt32(Console.ReadLine());
                        while (i_2 == 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Похоже вы неподходящее число, введите иное число для i_2:");
                            i_2 = Convert.ToInt32(Console.ReadLine());
                        }
                        Console.WriteLine();
                        R_x = a * b + b / t - x + f * i_2;
                        Console.WriteLine("Ответ: R_x: {0:N5}", R_x);
                        Console.WriteLine();
                        l = false;
                    }
                    l = true;
                }
                if (PersTask == 0)
                {
                    Console.WriteLine("Тикаем отсюда");
                    break;
                }
            }
        }
    }
}
